/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    // Handler for .ready() called.
    //$( "#fechaNacimiento" ).datepicker();

    //cambiar estado civil
    if ($("#civil").val() < '1') {
        $("#estadoCivil").val('-1');
    } else {
        $("#estadoCivil").val($("#civil").val());
    }


    if ($("#sexo1").val() === 'M') {
        $('#masculino').prop('checked', true);
        $('#femenino').prop('checked', false);
    } else {
        $('#masculino').prop('checked', false);
        $('#femenino').prop('checked', true);
    }
});

