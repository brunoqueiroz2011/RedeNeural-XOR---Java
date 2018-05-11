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
public class Training {
    
    private float learningRate;
    private int[] output;
    private int[] erro;    

    public Training() { 
        this.erro = new int[4];
        this.output = new int[4];
        this.learningRate = (float) 0.1;
    }      
    
    public void somatorio(Neuron neuron,int[] pi_A, int[] pi_B){         
        for (int i = 0; i < pi_A.length; i++) {
            float x = (pi_A[i] * neuron.getWeights_A()) + (pi_B[i] * neuron.getWeights_B());
            output[i] = ( x > neuron.getThreshold()) ? 1: 0;
        }
    }
    
    public void LearningError(int[] expectedValue){        
        for (int i = 0; i < output.length; i++) {
            erro[i] = expectedValue[i] - output[i];            
        }
    }
    
    public boolean TrainingCompleted(){        
        int erroRate = 0;
        for (int i = 0; i < erro.length; i++) {
            erroRate += erro[i];
        }              
        
        return (erroRate == 0);
    }
    

    public float getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(float learningRate) {
        this.learningRate = learningRate;
    }

    public int[] getOutput() {
        return output;
    }

    public void setOutput(int[] output) {
        this.output = output;
    }

    public int[] getErro() {
        return erro;
    }

    public void setErro(int[] erro) {
        this.erro = erro;
    }
    
    
}
