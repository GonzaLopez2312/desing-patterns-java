## *Command Pattern*

The Command Pattern turns a request into an independent object that contains all the information about the request. This
transformation allows you to parameterize methods with different requests, delay the execution of a request, queue them,
and support operations that can be undone.

In this example we have a note editor, that allows you to append text to the current content, and delete the last written
entry from the history. The example helps us understand how to execute, and undo text editing operations using the Command Pattern.