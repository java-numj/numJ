package com.library.numj;

import com.library.numj.enums.DType;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class that provides standardized exception messages for the NumJ library.
 * This class contains methods to generate detailed error messages for various exceptions
 * that may occur during array operations.
 */
public final class ExceptionMessages {

	/** Message indicating an unsupported operation on a given type. */
	public static final String unsupportedOperation = "The operation you have provided is not supported on this type of value";

	/**
	 * Generates an exception message for inhomogeneous array shapes.
	 *
	 * @param ndim  The number of dimensions where the inhomogeneity was detected.
	 * @param shape The current shape of the array up to the point of inhomogeneity.
	 * @return A formatted exception message indicating the inhomogeneous shape.
	 */
	public static String getShapeException(int ndim, List<Integer> shape) {
		shape.remove(shape.size() - 1);
		ndim--;
		return "The requested array has an inhomogeneous shape after "
				+ ndim + " dimensions. The detected shape was " + shape
				+ " + inhomogeneous part.";
	}

	/**
	 * Generates an exception message for negative array sizes.
	 *
	 * @param size The negative size encountered.
	 * @return A formatted exception message indicating the illegal negative size.
	 */
	public static String negativeSizeException(int size) {
		return "IllegalArgumentException : Size ("+size+")of the array cannot be negative.";
	}

	/**
	 * Generates an exception message for negative skip values.
	 *
	 * @param skip The negative value encountered.
	 * @return A formatted exception message indicating the illegal negative skip.
	 */
	public static String negativeSkipException(int skip) {
		return "IllegalArgumentException : Skip value ("+skip+")cannot be negative.";
	}


	/**
	 * Generates an exception message when reshaping arrays with mismatched sizes.
	 *
	 * @param inputShape  The size of the original array.
	 * @param outputShape The desired shape that does not match the original size.
	 * @return A formatted exception message indicating the shape mismatch.
	 */
	public static String shapeMismatchedException(long inputShape, String outputShape) {
		return "ShapeException : Cannot reshape array of Shape " + inputShape + " into Shape " + outputShape;
	}

	/**
	 * Generates an exception message for unsupported data types.
	 *
	 * @param dType The data type that is not supported.
	 * @return A formatted exception message indicating the illegal data type.
	 */
	public static String illegalDataType(DType dType) {
		return "IllegalArgumentException : Data type you have provided is not supported: " + dType;
	}

	/**
	 * Generates a detailed message for a shape mismatch exception.
	 *
	 * @param size The expected size of the array.
	 * @param shape The provided shape of the array.
	 * @return A formatted message indicating the shape mismatch.
	 */
	public static String shapeMismatchException(int size, int... shape) {
		return "ShapeMismatchException: The provided shape: " + Arrays.toString(shape) +
				" is not matching with the provided size: " + size;
	}


	/**
	 * Generates an exception message indicating that the identity diagonal index
	 * is greater than the number of columns in the matrix.
	 *
	 * @param cols            The number of columns in the matrix.
	 * @param identityDiagonal The specified identity diagonal index.
	 * @return A formatted exception message.
	 */
	public static String diagonalGreaterThanColsException(int cols, int identityDiagonal) {
		return "IllegalArgumentException: identityDiagonal " + identityDiagonal +
				" could not be greater than the number of columns " + cols;
	}

	/**
	 * Generates an exception message indicating that the identity diagonal index
	 * is smaller than the number of rows in the matrix.
	 *
	 * @param rows            The number of rows in the matrix.
	 * @param identityDiagonal The specified identity diagonal index.
	 * @return A formatted exception message.
	 */
	public static String diagonalLessThanRowsException(int rows, int identityDiagonal) {
		return "IllegalArgumentException: identityDiagonal " + identityDiagonal +
				" could not be smaller than the number of rows " + rows;
	}

	public static String emptyShapeException(int... shape)
	{
		return "Invalid Shape Exception: Shape could not be empty "+Arrays.toString(shape);
	}


}
