/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redeneural_xor;

/**
 *
 * @author ETP021250
 */
public class RedeNeural_XOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Neuron neuron = new Neuron();
        neuron = new Neuron(0.2f,0.3f,-0.1f);
        
        Training training = new Training();
        
        //Logic Door AND
        int[] value_A = {0,0,1,1}; //Input A
        int[] value_B = {0,1,0,1}; //Input B
        int[] output  = {0,0,0,1}; //Output of the logic door
        
        boolean learned = false;
        
        while (!learned) {             
            training.somatorio(neuron,value_A, value_B); 
            training.LearningError(output);            
            
            learned = training.TrainingCompleted();
            
            DrawTable(value_A,value_B,output,training,neuron);
            
            if (!learned) {
                neuron.calibrationWeights(training.getLearningRate());
            }            
        }                
        
    }
    
    public static void DrawTable(int[] value_A,int[] value_B,int[] output, Training training, Neuron neuron){
        System.out.println("Neuron");
        System.out.println("_______________________________________");
        System.out.println("| A | B | T |");
        System.out.println("_______________________________________");
        System.out.println("| "+neuron.getWeights_A()+" | "+neuron.getWeights_B()+" | "+neuron.getThreshold()+" |");
        System.out.println("_______________________________________");
        System.out.println("_______________________________________");
        System.out.println("| A | B | Somatorio | Saida | Erro |");
        for (int i = 0; i < value_A.length; i++) {
            System.out.println("_______________________________________");
            System.out.println("| "+value_A[i]+" | "+ value_B[i]+" | "+training.getOutput()[i]+" | "+training.getErro()[i]+" |");           
        }     
        System.out.println("_______________________________________");
    }
    
}
