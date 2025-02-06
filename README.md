# GENERAL GUIDE

## Download

### Scala

- First, download c++ redistributable if you haven't yet, both X64 and X86: <https://learn.microsoft.com/es-es/cpp/windows/latest-supported-vc-redist?view=msvc-170>
- And Scala from here: <https://www.scala-lang.org/download/>
- Download java and add it to your PATH
  - Download JDK from here: <https://www.oracle.com/java/technologies/downloads/>
  - Just add `C:\Program Files\Java\jdk-<version>\bin` to PATH
- Restart PC
- Run `java -version` and `scala -version` to test the installings.

### SBT

- From here: <https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Windows.html>

## Hello world

`sbt new scala/hello-world.g8`  
When asked: `"hello-world"`

## Running

### With "Code Runner" (VSC extension)

After the steps of downloading raw Scala, you would be able to just press the Run button above when seeing a `<project-name>\src\main\scala\<script-name>.scala`

### With sbt (zzzzzz)

(On the project directory, not on the code)
`sbt`  
`~run` (to run continuously at saves)
