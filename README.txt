1) To help make sure the ListStack and ArrayStack were working properly, I included a toString() method 
   for each so that I could get a visual representation of the respective stack. Additionally, I made a 
   separate client program that created a stack of each kind, calling push, pop, and peek on them several
   times and using toString to make sure they were consistent with what I would expect. 
   
2) "The scent of bitter almonds always reminded him of the fate of unrequited love."

3) The mathematical representation of the array's size after continuously doubling (starting with size 10) 
   is 10 * (2^n), where n an integer value that is the amount of times doubling has occurred. For a .dat file 
   with 1 million lines, the array would need to resize 17 times since 10 * (2^17) = 1,310,720 and it is the 
   smallest value for n that lets the size expression equate to at least 1 million. Likewise for 1 billion 
   lines, resizing would need to occur 27 times since 10 * (2^27) = 1,342,177,280. And for 1 trillion lines, 
   resizing would need to occur 37 times since 10 * (2^37) = 1,374,389,534,720.

4) Implementing a stack as a FIFO queue would only require an instance of one queue. Pushing could be done by
   a simple enqueue call. However, popping requires continuously removing and adding back to the queue until 
   the number at the top of the stack is the number at the end of the queue so that it can be dequeued. The 
   pseudo code is as follows:
   
   public void push(int number) {
      add number to queue;
   }
   
   public int pop() {
      for (size - 1 times) {
         remove number from queue;
         add that same number back to the queue;
      }
      remove and return the last number in the queue;
   }
   
5) With a queue implementation, you never have wasted space but you do with an array. The runtime for push()
   will be constant for both since the only thing that has to be done is add the data to the array/queue. 
   However, popping from a FIFO queue requires continuously looping through until the number at the top
   of the stack is at the end of the queue. On the other hand, popping from an array simply requires setting
   the element at the (size - 1) index equal to null in the array and returning it due to random access. The 
   operation is constant, unlike the queue's which depends on the size. For this reason I would choose an array
   implementation over a queue.
   
6) My project doesn't go terribly "above and beyond", but there were maybe a couple of things I chose to include 
   for my own sake that were not required by the specification. For example, I chose to write a toString() method 
   for both the ArrayStack and ListStack that really helped me get a visual representation of what I was doing and
   was particularly useful for debugging. Other than that, it's not exactly ambitious but should get the job done.
   
7) It's been over a year since I took CSE 143, so it was pretty fun to get back in the swing of Java coding. I can't
   say I'm a huge fan of having these written questions, but hey, I can learn to deal. Also, the spec's description 
   of the way sox worked was particularly confusing and only really seemed helpful if you were using a Windows machine.
   I'm on a Mac but was luckily able to figure it out, though maybe that should be explained a little bit better. Thanks!
   
 8) Nothing! :)