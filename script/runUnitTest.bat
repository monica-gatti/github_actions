@echo off
setlocal enabledelayedexpansion
set junit_path=C:\Users\LENOVO\.p2\pool\plugins
echo %classpath%
set classpath=%classpath%;%junit_path%
set source_folder=C:\SourceCode\EclipseWorkspace\HelloWorld
set class_folder=C:\SourceCode\EclipseWorkspace\HelloWorld\bin\com
set test_folder=C:\SourceCode\EclipseWorkspace\HelloWorld\src\com\unittest
for /r %source_folder% %%f in (*.java) do (
  javac -d %class_folder% -cp %classpath% %%f
)
for /r %test_folder% %%f in (*Test*.java) do (
  set result=
  javac -d %class_folder% -cp %classpath%;%class_folder% %%f
  set class_name=%%~nf
  set class_name=!class_name:~0,-4!
  java -cp %classpath%;%class_folder% org.junit.runner.JUnitCore !class_name! > nul && (
    set result=pass
  ) || (
    set result=FAIL
  )
  echo !class_name! - !result!
)
