# 软件工程实训任务一：代码规范与标注

## 任务目的
* 理解软件代码规范的重要性
* 理解代码变化对软件质量带来的影响
* 掌握基于Git的个人代码版本维护方法
* 掌握MarkDown文件编写方法

## 任务内容
* 阅读、理解和标注样例代码
* 分析和学习代码质量特征、设计方法和编程风格
* 运用所学方法，对开源代码进行标注
* 对样例工程进行简单功能扩充和维护

## 任务要求
1. 阅读和描述样例工程
    * fork样例工程，并clone到本地仓库；
    * 在本地开发环境上运行样例工程，理解样例工程的代码逻辑；
    * 精读样例工程软件代码，描述代码结构及部件组成；
    * 以UML图描述样例工程的组成及结构图（类及类之间的关系）
        * 可结合markdown语法和mermaid插件绘制所需图形
    
2. 标注样例工程中的代码
    * 基于javadoc规范标注代码，对包、类、方法、代码片段、参数和语句等代码层次进行注释（可参考Game类的标注样例）；
    * 注释后的代码提交到本地代码库后，同步推送到远程代码仓库；
    * 可参考ESLint、github/super-linter等开发插件了解关于代码规范的相关知识；
    
3. 扩充和维护样例工程
    * 对样例代码中的功能设计进行分析，找出若干设计缺陷和改进点，并进行修正或扩充，并集成到工程代码中；
    * 可借助代码质量分析工具或代码规范检查工具（如SonarQube、ESLint等)对代码质量进行分析，发现潜在问题；
    
    > 提示：样例工程的代码结构存在一些可以改进的功能点，可参考下列说明进行改进：
    >
    > 在Game类的processCommand()方法中，当用户输入的命令被辨认出来以后，有一系列的if语句用来分派程序到不同的地方去执行。从面向对象的设计原则来看，这种解决方案不太好，因为每当要加入一个新的命令时，就得在这一堆if语句中再加入一个if分支，最终会导致这个方法的代码膨胀得极其臃肿。如何改进程序中的这个设计，使得命令的处理更模块化，且新命令的加入能更轻松？请描述你的解决思路，并对你的解决方案进行实现和测试。
## 任务输出
1. 以UML图表示的样例工程软件结构；
2. 在所有源代码文件中完成源代码标注和扩充，并通过git提交到代码库；；
3. 每位同学在项目根目录下创建一个名称为REPORT.md的文件（与README.md文件同级），以markdown语法格式编写本实训任务的报告，主要包含样例工程的代码结构分析（可以用UML类图及文字进行说明），以及自己改进的功能实现说明；
