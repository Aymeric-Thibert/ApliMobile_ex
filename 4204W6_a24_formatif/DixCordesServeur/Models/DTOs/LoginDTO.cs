﻿using System.ComponentModel.DataAnnotations;

namespace DixCordesServeur.Models.DTOs
{
    public class LoginDTO
    {
        [Required]
        public string Username { get; set; } = null!;
        [Required]
        public string Password { get; set; } = null!;
    }
}
