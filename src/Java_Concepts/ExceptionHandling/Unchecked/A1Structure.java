package Java_Concepts.ExceptionHandling.Unchecked;

public class A1Structure {
//   	java.lang.Object
//       |
//       v
//   java.lang.Throwable
//       |
//       +--> java.lang.Error
//       |       |
//       |       +--> java.lang.VirtualMachineError
//       |       |       |
//       |       |       +--> java.lang.OutOfMemoryError       // Thrown when the JVM runs out of memory.
//       |       |       +--> java.lang.StackOverflowError     // Thrown when the stack overflows due to deep recursion.
//       |       |
//       |       +--> java.lang.LinkageError
//       |               |
//       |               +--> java.lang.ClassFormatError       // Thrown for malformed class files.
//       |               +--> java.lang.NoClassDefFoundError   // Thrown when a required class is not found.
//       |
//       +--> java.lang.Exception
//               |
//               +--> java.lang.RuntimeException
//               |       |
//               |       +--> java.lang.ArithmeticException        // Errors in arithmetic operations (e.g., division by zero).
//               |       +--> java.lang.NullPointerException       // Accessing an object reference that is null.
//               |       +--> java.lang.IndexOutOfBoundsException  // Invalid index for arrays or collections.
//               |       +--> java.lang.IllegalArgumentException   // Invalid arguments passed to a method.
//               |
//               +--> java.io.IOException
//               |       |
//               |       +--> java.io.FileNotFoundException        // File not found during an operation.
//               |       +--> java.io.EOFException                 // End of file reached unexpectedly.
//               |
//               +--> java.sql.SQLException                        // Errors interacting with a database.
//               |
//               +--> java.lang.reflect.InvocationTargetException  // Issues when invoking methods via reflection.
//               |
//               +--> java.net.SocketException                     // Errors during socket communication.
//               +--> java.net.UnknownHostException                // Unable to resolve the hostname.
}
