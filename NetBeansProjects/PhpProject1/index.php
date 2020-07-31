<?php
define('FILENUM', 1);
$input = file_get_contents('input'.FILENUM.'.txt');
$rows = explode("\n", $input);

$averages = [];

for($i = 1, $n=sizeof($rows); $i< $n; $i++){
    $notes = explode(' ',$rows[$i]);
    $result = ($notes[0] + $notes[1] + $notes[2])/3;
    array_push($averages,$result);
}

$output = ceil(max($averages));

echo "la meilleur note :". $output;



?>