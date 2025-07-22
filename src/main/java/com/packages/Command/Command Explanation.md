The Command Pattern turns a request into an independent object that contains all the information about the request. This
transformation allows you to parameterize methods with different requests, delay the execution of a request, queue them,
and support operations that can be undone.

In this example we have a note editor, that allows you to append text to the current content, and delete the last written
entry from the history.

If we execute this code:  
TextEditor editor = new TextEditor();
EditorInvoker invoker = new EditorInvoker();

Command writeHello = new WriteCommand(editor, "Hello ");  
Command writeWorld = new WriteCommand(editor, "World!");  

invoker.executeCommand(writeHello);   
invoker.executeCommand(writeWorld);   

invoker.undoLastCommand();  
invoker.undoLastCommand();    

Command writeAgain = new WriteCommand(editor, "Again!");  
invoker.executeCommand(writeAgain);    

Command deleteAll = new DeleteCommand(editor);  
invoker.executeCommand(deleteAll);      
invoker.undoLastCommand();          

You will see the following output in the console:

Text after writing: Hello  
Text after writing: Hello World!  
Text after deleting: Hello  
Text after deleting:  
Text after writing: Again!  
Text after deleting:  
Text after writing: Again!  

To conclude, the example helps us understand how to execute, and undo text editing operations using the Command Pattern.