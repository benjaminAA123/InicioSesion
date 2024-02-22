package com.iesam.InicioSesion.Domain;

public class InittSesion {

    private UserService userService;

    public InittSesion(UserService userService) {
        this.userService = userService;
    }

    public void sesion(String nameUser) {
        User user = userService.obtainUser(nameUser);

        if (user != null) {
            if (user.isInicioSesion()) {
                System.out.println("Bienvenido  " + user.getNombre() + " Este sera tu primer inicio de sesión");
                user.setInicioSesion(false);
            } else {
                System.out.println("No se indentifica al usuario ");
            }
        }

    }
}
