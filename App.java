public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Pérez", "123", 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("María López", "456", 15.0, 20);
        
        // Bucle "for it"
        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());
        }
    }
}

