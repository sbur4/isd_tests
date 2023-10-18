package java_trial_test.part_4;

/**
 * 34. You are taking over an aquarium simulation project. Your predecessor created a generic Fish class that includes
 * an oxygenConsumption method declared as follows:
 * <p>
 * public float oxygenConsumption( float temperature )
 * <p>
 * The aquarium simulation sums oxygen consumption for all fish in the tank with the following code fragment,
 * where fishes is an array of Fish object references:
 * <p>
 * float total = 0 ;for( int i =0 ; i < fishes.length ;i++ ){total fishes[i].oxygenConsumption( t );}
 * <p>
 * <p>
 * You are writing a subclass for a particular fish species. Your task is to  provide a method with species-specific
 * metabolism data that will transparently fit into the simulation.
 * <p>
 * Do you want to overload or override the oxygenConsumption method?
 * A. Overload it.
 * <p>
 * // B. Override it.  +
 */

// B