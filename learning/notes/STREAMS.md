## Streams API 
Streams are used to process a collection of objects
When we need to do many intermediate operations and get a result based on a collection, streams can be used.
It does not change the original data structure. And streams are not data structures also. Rather than storing data into variables and processing in several steps,
we can do same thing using streams in one line!! 

## NOTE: 📓
We should be familiar with Lambda expressions to get the real benefit of streams.
There are 2️⃣ main types of stream operations…

### Non-Terminal/Intermediate Operations
These operations are always returning another stream as an intermediate result.

map(), filter(), distinct(), sorted(), limit(), skip()
map — Apply some function and create a different output from the stream
filter — Select elements that are validated by a predicate
sorted — Sort the elements in the stream

### Terminal Operations
These operations are returning a non-stream(cannot be chained) result such as primitive value, a collection or no value at all.

forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
collect — Return the result as a list after stream operations
forEach — Iterate over the elements of the stream
reduce — Reduce the elements of the stream to a single value
