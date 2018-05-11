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
public class Neuron {

    private float threshold;
    private float weights_A;
    private float weights_B;

    public Neuron() {}

    public Neuron(float threshold, float weights_A, float weights_B) {
        this.threshold = threshold;
        this.weights_A = weights_A;
        this.weights_B = weights_B;
    }
    
    public void calibrationWeights(float learningRate){
        setWeights_A(getWeights_A() - learningRate);
        setWeights_B(getWeights_B() + learningRate);
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

    public float getWeights_A() {
        return weights_A;
    }

    public void setWeights_A(float weights_A) {
        this.weights_A = weights_A;
    }

    public float getWeights_B() {
        return weights_B;
    }

    public void setWeights_B(float weights_B) {
        this.weights_B = weights_B;
    }
    
    

}
