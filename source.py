
def main():

	file = open("paris_54000.txt",'r')
	input = file.readlines()
	params = input[0].split()
	N = int(params[0])
	M = int(params[1])
	T = int(params[2])
	C = int(params[3])
	S = int(params[4])
	junctions = input[1:N+1]
	streets = input[N+1:]



if __name__ == '__main__':
	main()
