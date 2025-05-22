
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using DixCordesServeur.Data;
using Microsoft.AspNetCore.Authorization;
using DixCordesServeur.Models;
using DixCordesServeur.Models.DTOs;
using System.Security.Claims;

namespace DixCordesServeur.Controllers
{
    [Route("api/[controller]/[action]")]
    [ApiController]
    public class ChannelsController : ControllerBase
    {
        private readonly DixCordesServeurContext _context;

        public ChannelsController(DixCordesServeurContext context)
        {
            _context = context;
        }

        [HttpGet]
        public async Task<ActionResult<IEnumerable<Channel>>> GetChannel()
        {
            if (_context.Channels == null)
            {
                return NotFound();
            }
            return await _context.Channels.ToListAsync();
        }

        [HttpPost]
        [Authorize(Roles = "moderator")]
        public async Task<ActionResult<Channel>> CreateChannel(ChannelDTO channelDTO)
        {
            User? user = await _context.Users.FindAsync(User.FindFirstValue(ClaimTypes.NameIdentifier));
            Channel channel = new Channel { Id = 0, Name = channelDTO.NomChannel, Messages =null };
            if (user == null) return Unauthorized();

            _context.Channels.Add(channel);
            await _context.SaveChangesAsync();

            

            



            return Ok();
        }
    }
}
