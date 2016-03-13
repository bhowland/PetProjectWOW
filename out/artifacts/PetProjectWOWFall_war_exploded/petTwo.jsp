<%
  Object petTwo = request.getAttribute("petTwo");
  Object petTwoInfo = request.getAttribute("petTwoInfo");
  if ( petTwo == null )
  {
%>
<p>Missing Pet</p>
<%
}
else
{
%>
<%= petTwo.toString() %>
<%
  }
%>
<script>
  $( ".two" ).hover(

          function() {
            $( this ).append( "<span><p> <%= petTwoInfo.toString() %> </p></span>" );
          }, function() {
            $( this ).find( "span:last" ).remove();
          }
  );
</script>
