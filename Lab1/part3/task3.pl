sub uniq {
    my %seen;
    grep !$seen{$_}++, @_;
}

@array =<STDIN>;
$str = join('', @array);

@links = $str =~ m/<\s*a.*?href\s*=\s*["'](.*?)["'].*?\s*>/g;

foreach ( @links ) {
  $_ = $_ =~ s/\s//rg;
  $_ =~ /^(([^:\/?#]+):)?(\/\/([^\/?#]*))?([^?#]*)(\?([^#]*))?(#(.*))?/;
  $_ = $4 || $2;
  $_ = $_ =~ s/^([^:]*)(:.*)?/$1/rg;
}

$result = join("\n", sort(uniq( 
  @links
))) =~ s/^\n//rg;

print $result;