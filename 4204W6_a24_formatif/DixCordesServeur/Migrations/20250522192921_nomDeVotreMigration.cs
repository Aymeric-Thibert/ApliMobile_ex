using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DixCordesServeur.Migrations
{
    /// <inheritdoc />
    public partial class nomDeVotreMigration : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.UpdateData(
                table: "AspNetUsers",
                keyColumn: "Id",
                keyValue: "11111111-1111-1111-1111-111111111111",
                columns: new[] { "ConcurrencyStamp", "PasswordHash", "SecurityStamp" },
                values: new object[] { "2daf6ffb-03e0-4a35-9826-dfac23111b48", "AQAAAAIAAYagAAAAEArhhwKEO4TKYXOsA/iWSfavcQN9pH/RcoctiMLgqdgbSVqz9xdbojtceQJW4qFPtw==", "c830b9bc-5536-43bf-be7e-16b24dd41cbe" });

            migrationBuilder.UpdateData(
                table: "AspNetUsers",
                keyColumn: "Id",
                keyValue: "11111111-1111-1111-1111-111111111112",
                columns: new[] { "ConcurrencyStamp", "PasswordHash", "SecurityStamp" },
                values: new object[] { "a2f6cf8b-9441-48f5-950b-711484632ef3", "AQAAAAIAAYagAAAAEB66nEvkQpO746Ml//dT9zU0+yo5qu8juQO8XBOiRxP7qEJBkNa9ofhXtEq5br7SuQ==", "b0ad69c1-3d61-4f93-90a1-23fef0819d93" });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.UpdateData(
                table: "AspNetUsers",
                keyColumn: "Id",
                keyValue: "11111111-1111-1111-1111-111111111111",
                columns: new[] { "ConcurrencyStamp", "PasswordHash", "SecurityStamp" },
                values: new object[] { "642b0c4f-09f4-4f13-856d-11e478faecd6", "AQAAAAIAAYagAAAAEEQG+7BkhI4dG88ktabGIYSvy54g3TgVFwAcQ2y7Ixmx/EDGMg4dpzFKZdhP39n/hA==", "8d427c0f-528d-4712-8289-928e17d77f12" });

            migrationBuilder.UpdateData(
                table: "AspNetUsers",
                keyColumn: "Id",
                keyValue: "11111111-1111-1111-1111-111111111112",
                columns: new[] { "ConcurrencyStamp", "PasswordHash", "SecurityStamp" },
                values: new object[] { "3d38b80d-2fdc-4f94-abb1-76e192c42f23", "AQAAAAIAAYagAAAAELS5TU0kt1Ev2oZZ71dPm14iyEPpc1cPEy0FX162p1hUYElJ4cOtoDo4KLCzxWroZA==", "8c48bc7d-4e79-43c1-9c9d-2eab3377456d" });
        }
    }
}
