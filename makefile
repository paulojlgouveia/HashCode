
clean:
	@clear
	@rm -f src/*.class
	@rm -f output/HC2017_mul71p4ul05.zip


compile: clean
	@javac src/*.java


run: clean
	@javac src/*.java
	@java -cp "src/" Main
	@echo
	
submission: run
	@rm -f src/*.class
	zip -r output/HC2017_mul71p4ul05.zip src
	@echo
	