# mavenize-tool

I have implemented a user interface on top of the core library. This will form the basis of any future updates. The project page is here:

https://github.com/alistairrutherford/mavenize

Mavenize
You can download an executable JAR from the downloads page.

Essentially this project has moved to github but I will keep this page for distributing the executables.

mavenize (Command line version)
This tool will take any number of existing java projects and

Generate the maven directory structure.
Split source and resource files apart and drop them into the relevant directory.
Generate a default pom with configurable version and package types.
Generate group id's based on the most common package prefix.
Generate artifact id's based on project title.
If the source project is a 'netbeans' module it will read the project description files and generate dependencies.

Arguments:

-i {input directory path}
-o {output directory path}
-t {project type} (Optional - only choice apart from default is 'netbeans')
-v {version} (Optional - defaults to 1.0.0)
-p {packaging} (Optional - defaults to JAR)
Typical usage:

java -jar mavenize-1.0.2.jar -iC:\Development\java\project\original -oC:\Development\java\project\mavenized
java -jar mavenize-1.0.2.jar -iC:\Development\java\original -oC:\Development\java\mavenized -v0.0.1-SNAPSHOT -pZIP
You can drop it into the top level of your project directory and issue on the command line from the directory:

java -jar mavenize-1.0.2.jar -i.\ -o.\mavenized
How It Works
The tool will search for each occurrence of a "src" directory under the input directory and treat each one it finds as a new project. It will then recreate the mavenized directory structures under the output directory with the pom in the appropriate place.

The group id will be generated based on the most common package prefix for the source files being processed within a project.

The artifact id will be the lowercase version of the top level project directory i.e. the one that contains the "src" directory.

Tips
Don't make the output directory the same as the input. That wouldn't be very clever.
There is a companion tool to this called pommel which will replace dependencies for you. See links at the side.
Java
Command line: Uses Java 1.6+

FX: Used Java 1.7+

This Version
Command line: 1.0.2

Fixed an issue with the pom generator for netbeans where empty project dependancies were causing an exception.
Added some more feedback during execution.
FX: 1.0.0

First upload.
