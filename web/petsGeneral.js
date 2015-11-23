/**
 * Created by benjaminhowland on 11/11/15.
 */
jQuery(document).ready(function($)
{
loadThePets();
    });

function loadThePets(){

    $.get("https://us.api.battle.net/wow/pet/?locale=en_US&apikey=f3ebrq7wgwak8ksbr2r9r9u3ytuga37s", function(t){
        formThePet(t);
    }, "json");
}

function formThePet(pet){

    $(pet).find(data).each(function(){
        var canBattle = $(this).find('canBattle');
        var creatureId = $(this).find('creatureId');
        var name = $(this).find('name');
        var family = $(this).find('family');
        var icon = $(this).find('icon');
        var strongAgainst = $(this).find('strongAgainst');
        var typeId = $(this).find('typeId');
        var weakAgainst = $(this).find('weakAgainst');

        var li = $("<td>" + canBattle + creatureId + name + family
            + icon + strongAgainst + typeId + weakAgainst + "</td>");
      var tr = $("<tr>")

    tr.append(li);
    $(output).append(tr);
    })
}