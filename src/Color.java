
public enum Color {
	PURPLE("\033[95m"),
	BLUE("\033[94m"),
	CYAN("\033[96m"),
	GREEN("\033[92m"),
	YELLOW("\033[93m"),
	RED("\033[91m"),
	
	BOLD("\033[1m"),
	UNDERLINE("\033[4m"),
	ITALIC("\033[3m"),
	
	END("\033[0m");
	
	
	private String _colorCode;
	
	Color(String code) {
		_colorCode = code;
	}
	
	
	public String purple(String string) { return Color.PURPLE + string + Color.END; }
	public String blue(String string) { return Color.BLUE + string + Color.END; }
	public String cyan(String string) { return Color.CYAN + string + Color.END; }
	public String green(String string) { return Color.GREEN + string + Color.END; }
	public String red(String string) { return Color.RED + string + Color.END; }
	public String yellow(String string) { return Color.YELLOW + string + Color.END; }
	
	public String italic(String string) { return Color.ITALIC + string + Color.END; }
	public String underline(String string) { return Color.UNDERLINE + string + Color.END; }
	public String bold(String string) { return Color.BOLD + string + Color.END; }
	
	
}

/*

def print_stack(stack, name = ""):
	
	if name is None:
		for n in stack:
			print(n)
		
	else:
		print(name)
		for n in stack:
			print("\t" + n)


def print_numbered_list(bag):	
	if isinstance(bag, dict):
		for k, v in sorted(bag.items()):
			print(" " + str(k).rjust(3) + "  " + v[1])
		
	elif isinstance(bag, list):
		for t in range(len(bag)):
			print(" " + str(t).rjust(3) + "  " + bag[t])


def get_unic_strs(bag):
	output = []
	seen = set()
	
	for thing in bag:
		if str(thing) not in seen:
			output.append(str(thing))
			seen.add(str(thing))
	
	return output


def print_file(filePath):
	
	try:
		print("\n" + filePath)
		with open(filePath, 'r') as fp:
			ln = 1
			for line in fp:
				print(" {}: {}".format(str(ln).rjust(2), line.strip('\n')))
				ln = ln + 1
			
	except IOError as e:
		print(e)

*/
