<%
  Object petOne = request.getAttribute("petOne");
  Object petOneInfo = request.getAttribute("petOneInfo");
  if ( petOne == null )
  {
%>
<p>Missing Pet</p>
<%
}
else
{
%>
<%= petOne.toString() %>
<%
  }
%>
<script>
  $( ".one" ).hover(

          function() {
            $( this ).append( "<span><p> <%= petOneInfo.toString() %> </p></span>" );
          }, function() {
            $( this ).find( "span:last" ).remove();
          }
  );
</script>
