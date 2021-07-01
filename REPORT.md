

# 软件工程实践-代码规范与标注  实验报告



## 一.样例工程软件结构(UML图)
这里的类和类之间都是依赖的关系，主要表现为一个类对另一个类的局部变量、方法的参数或者对静态方法的调用，例如Game类对于Command类的isUnknown()方法的调用，Parser类对于CommandWords类isCommand(aString)的调用等。
![zhe=](https://img-blog.csdnimg.cn/20210701103045665.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1NDE0NjY5,size_16,color_FFFFFF,t_70#pic_center)



## 二.改进的功能实现说明
问题：
在Game类的processCommand()方法中，当用户输入的命令被辨认出来以后，有一系列的if语句用来分派程序到不同的地方去执行。从面向对象的设计原则来看，这种解决方案不太好，因为每当要加入一个新的命令时，就得在这一堆if语句中再加入一个if分支，最终会导致这个方法的代码膨胀得极其臃肿。

改进：
将这些if语句替换为switch-case语句，由于判断的是字符串比较，所以可以直接用switch来替代，从而简化了操作，再后续增加命令时也更容易增加。

**改变之后的代码块**
```java
switch(commandWord) {
             case "help":
                 printHelp();
                 break;
             case "go":
                 goRoom(command);
                 break;
             case "quit":
                 wantToQuit = quit(command);
                 break;
         }
```

**之前的代码块(已注释掉)**

```java
//        if (commandWord.equals("help")) {
//            printHelp();
//        }
//        else if (commandWord.equals("go")) {
//            goRoom(command);
//        }
//        else if (commandWord.equals("quit")) {
//            wantToQuit = quit(command);
//        }
```

