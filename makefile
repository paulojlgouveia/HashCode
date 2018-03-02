
clean:
	clear
	@rm -f src/*.class


compile: clean
	@javac src/*.java


run: compile
	@java -cp "src/" Main
	@echo
