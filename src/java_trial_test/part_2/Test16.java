package java_trial_test.part_2;

/**
 * 16. You are writing a set of classes related to cooking and have created your
 * own exception hierarchy derived from java.lang.Exception as follows (note
 * that both BitterException and SourException descend from BadTasteException):
 * <p>
 * Exception
 * +-- BadTasteException
 * +-- BitterException
 * +-- SourException
 * <p>
 * Your base class, BaseCook, has a method declared as follows
 * <p>
 * int rateFlavor(Ingredient[] list) throws BadTasteException
 * <p>
 * A class,TexMexCook,derived from BaseCook has a method that overrides  BaseCook.rateFlavor().
 * Which of the following are legal declarations of the overriding method? [Check all correct answers.]
 * <p>
 * A.int rateFlavor(Ingredient[]list)throws BadTasteException +
 * B.int rateFlavor(Ingredient[]list)throws Exception
 * C.int rateFlavor(Ingredient[]list)throws BitterException +
 * D.int rateFlavor(Ingredient[]list)
 */

// A + C