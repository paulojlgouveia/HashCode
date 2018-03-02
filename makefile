
clean:
	@clear
	@rm -f src/*.class
	@rm -f output/HC2017_mul71p4ul05.zip


compile: clean
	@javac src/*.java


test: compile
	@java -cp "src/" Main a_example.in
	@echo


run: compile
	@java -cp "src/" Main
	@echo


submission: run
	@rm -f src/*.class
	zip -r output/HC2017_mul71p4ul05.zip src
	@echo
	