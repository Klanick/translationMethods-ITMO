while (<>) {
	print if /^([^\s](.*[^\s])?)?$/;
}