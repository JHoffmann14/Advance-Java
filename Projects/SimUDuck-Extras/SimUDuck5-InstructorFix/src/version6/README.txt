About Version 6
------------------
The key difference in this fix compared to version 5 in Chapter 1 of your book
is that none of the best practices are violated. Furthermore, only pure
abstractions (DIP compliant) in the form of Interfaces are used.

And, we use multiple interfaces, so that we can categorize our ducks 
differently. A big problem in the book is that ducks that can't do things
like fly or quack still have fly and quack methods. This doesn't make sense.
If a duck can't fly it shouldn't have a fly method. Remember, methods 
represent "behaviors" that objects have. To solve this problem we use an
Interface inheritance hierarchy to give ducks varying behaviors. All ducks,
for example can display themselves, so all ducks inherit from the "DuckGroup"
Interface. But only some ducks can fly, so those ducks inherit from the 
"FlyGroup" interface, which in turn extends the DuckGroup interface. This 
means that a duck who can fly can also disply itself. Some ducks can fly and
quack, so those ducks inherit from the "PerformAllGroup" interface. This 
interface inherits from all other interfaces, meaning a duck will have all
possible behaviors.

Now, if we want to work with a group of ducks who can fly, we simply create
an array of FlyGroup ducks and they are all interchangeable with each other
with respect to flying ability as well as display ability, but not necessarily
quacking ability.

Or, if we want ducks who can display themselves, but not necessary fly or
quack, we can create an array of "DuckGroup" ducks and ask them to display.
They will be interchangeable.

By using multiple interfaces we can treat any group of ducks in any way
that we want. Those behaviors become components that can be used to delete
work to (the low-level objects in the DIP). And because multiple ducks share
some of the same components, should a component need to be altered, we only
have to make those changes in one place -- in the component class. All ducks
that have that component automatically benefit from the change.
