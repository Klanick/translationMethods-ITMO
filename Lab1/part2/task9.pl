while (<>) {
	s/\([^\)]*\)/\(\)/g;
	print;
}