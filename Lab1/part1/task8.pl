while (<>) {
	print if /\(([^\(\)]*[^\w\(\)])?\w+([^\w\(\)][^\(\)]*)?\)/;
}