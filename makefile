
clean:
	@rm -f *.class


compile: clean
	javac *.java


run:
	@java Main
	@echo
