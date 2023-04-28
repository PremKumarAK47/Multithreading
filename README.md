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

## Thread Class and Its types-
- In Java, Thread class is a part of the java.lang package and provides built-in support for threads in Java. It is the top-level class in Java that provides multithreading capabilities to Java programs.

- Some of the types of threads in Java are:

- User Threads: These threads are created by the application to perform a specific task or job. User threads can be daemon or non-daemon threads.

- Daemon Threads: These threads are created by the JVM to perform background tasks such as garbage collection. Daemon threads are low-priority threads that run in the background and do not prevent the application from terminating.

- System Threads: These threads are created by the JVM to perform system-level tasks such as I/O operations and signal handling.

- Timer Threads: These threads are created by the Timer class to execute scheduled tasks at specified intervals.

- Thread Pools: A thread pool is a group of pre-initialized threads that are used to execute tasks in a multithreaded environment. Thread pools are commonly used in server applications to handle multiple requests simultaneously.

Each type of thread has its own characteristics and usage, and it's important to choose the appropriate type of thread for a particular task to ensure optimal performance and resource utilization.

## Methods of Thread class

Thread class provides several methods to manage and control threads. Some of the commonly used methods of Thread class are:

- start(): Starts the execution of the thread.

- run(): The code that is executed when a thread is started. This method needs to be overridden by the user to define the behavior of the thread.

- sleep(long millis): Causes the thread to sleep for the specified amount of time (in milliseconds).

- join(): Waits for the thread to finish its execution before proceeding to the next line of code.

- interrupt(): Interrupts the thread, causing it to stop its execution.

- isAlive(): Checks whether the thread is currently executing or not.

- getName(): Returns the name of the thread.

- setName(String name): Sets the name of the thread.

- setPriority(int priority): Sets the priority of the thread.

- getPriority(): Returns the priority of the thread.

- yield(): Causes the thread to voluntarily give up the CPU to other threads.

- isDaemon(): Checks whether the thread is a daemon thread or not.

- setDaemon(boolean daemon): Sets the thread as a daemon thread or a user thread.

- currentThread(): Returns a reference to the currently executing thread.

- activeCount(): Returns the number of active threads in the current thread group.

These are some of the commonly used methods of the Thread class. There are other methods available in the Thread class as well, but these are the most commonly used ones.
