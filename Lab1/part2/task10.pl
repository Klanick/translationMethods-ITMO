while (<>) {
	s/a(a?[^a]+)*aa(a?[^a]+)*aa[^a]*a/bad/g;
	print;
}