# Multithreading
All about Threading and MultiThreading
## Thread And Its Types-:
In Java, a thread is a lightweight process that can execute concurrently with other threads. It is a fundamental unit of execution that enables concurrent processing in a program. Each thread represents a separate flow of control and can execute its own code independently of the other threads.

***Java provides two ways to create a thread:***

- **Extending the Thread class:** In this approach, the class extends the Thread class and overrides the run() method to define the code that will be executed in the new thread.

- **Implementing the Runnable interface:** In this approach, the class implements the Runnable interface and provides the implementation for the run() method. The Thread class has a constructor that takes a Runnable instance as an argument, and this instance is used to create a new thread.

***Java provides several types of threads, which can be broadly classified as follows:***

- **User Thread:** A thread created explicitly by the user. These threads are not associated with any specific system task and are used for carrying out user-defined tasks.

- **Daemon Thread:** A daemon thread is a type of thread that runs in the background and provides services to other threads or applications running in the same process. Daemon threads do not prevent the application from exiting if all user threads have completed execution.

- **System Thread:** A system thread is created by the Java Virtual Machine (JVM) to carry out system-level tasks, such as garbage collection, finalization, and signal handling. These threads run in the background and are managed by the JVM.
