# Home work 2.1
## The class IntegerCollectionTest implements a collection of integers that allows you to perform operations:
- additions
- delete
- search for an element by value
- search for an item by index
- search for the maximum element
- search for the minimum element
- search for the arithmetic mean of all elements
### Condition:
- when you add a new element, all items increase their value to the item being added.
- when deleted - decrease their value on the element being deleted
It is not allowed to enter null, characters, and other values into the collection, except integers.

### Class IntegerCollection extends class ArrayList and override #add() and #remove() methods.
### Methods #get(by index) and #contains() are inherited from the parent class.
### In method find #min value, the min value always be last value.
### In method find #max value, the max value always be first value.