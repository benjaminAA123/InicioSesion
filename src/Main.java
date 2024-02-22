     import com.iesam.InicioSesion.Domain.InittSesion;
     import com.iesam.InicioSesion.Domain.User;
     import com.iesam.InicioSesion.Domain.UserService;

     public class Main {
      public static void main(String[] args) {

       UserService userService = new UserService();

       userService.addUser(new User("Usuario1", true));
       userService.addUser(new User("Usuario2", false));

          InittSesion inittSesion = new InittSesion(userService);


          //Simulacion de inicio de sesion
          inittSesion.sesion("Usuario2");
          inittSesion.sesion("Usuario1");
          inittSesion.sesion("Usuario3"); //no existe

       }
  }