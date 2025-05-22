using System.ComponentModel.DataAnnotations;

namespace DixCordesServeur.Models.DTOs
{
    public class ChannelDTO
    {

        [Required]
        public string NomChannel { get; set; } = null!;
        
    }
}
