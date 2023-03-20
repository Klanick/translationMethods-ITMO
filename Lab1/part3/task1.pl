$between = 0;
$empty = 0;
while (<>) {
    if (/\S/) {
        if ($between) {
            if ($empty) {
                print "\n";
            }
        } else {
            $between = 1;
        }
        s/\s+/ /g;
        s/^\s|\s$//g;
        print;
        print "\n";
        $empty = 0;
    } else {
        $empty = 1
    }
}