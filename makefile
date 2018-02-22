
clean:
	@rm -f *.class


compile: clean
	@javac *.java


run: compile
	@java Main
	@echo
