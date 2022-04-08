default:
	@echo "make target"
	@echo "targets: clean, compile, demo"

clean:
	rm bin/*.class

compile:
	javac -d bin src/*.java

demo:
	java -cp bin Demo
