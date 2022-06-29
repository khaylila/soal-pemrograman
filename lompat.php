$data = trim(fgets(STDIN));
// $data = '1 3 2 5';
// $data = '5 1 4 2 -1';
if ($data === null) {
    return 'data tidak ada' . PHP_EOL;
}
$values = explode(' ', $data);
if (count($values) == 1) {
    return 'takbir' . PHP_EOL;
}

$tempValue = [];
for ($i = 0; $i < count($values); $i++) :
    if ($i + 1 < count($values)) {
        $tempValue[] = abs($values[$i] - $values[$i + 1]) . PHP_EOL;
    }
endfor;
sort($tempValue);
$index = 0;
for ($i = intval($tempValue[0]); $i <= count($tempValue); $i++) :
    if ($i != $tempValue[$index++]) :
        return 'mantap' . PHP_EOL;
    endif;
endfor;
return 'takbir' . PHP_EOL;
