package Taller14.Ejercicio3;

public class InstanciasPersona {
    void main(){
        Persona persona = new Estudiante();
        persona.presentarse();

        // persona.estudiar(); // Error de compilación: el metodo no existe en Persona.
        Estudiante estudiante = new Estudiante();
        estudiante.estudiar();

        Persona personaIgual = new PersonaIgual();
        personaIgual.presentarse();
        System.out.println("La sobrescritura no aporta comportamiento y dificulta el mantenimiento.");
    }
}