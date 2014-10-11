rm -r bin
mkdir bin
javac -d bin `find . -name "*.java"`
cd bin
rm qfactor.jar
7z -tzip a ../qfactor.jar .
cd ..
cp qfactor.jar ../libs/
