<!-- CONTENT -->
<div id="content">
  <div id="posts">
    <div class="post">
      <h3 class="title">Gargra - Frostfire Ridge (68.6, 64.6)</h3>
      <div class="story">
        <p> Bit trickyish but fast and easy. Remeber you pet food buff!
          If this strat is not good for you there is a
          Wowhead link at the bottom, so you cant comb through the other strats.
        </p>
        <h4 class="title">The Pets</h4>
        <ul>
          <li><%
            Object petOne = request.getAttribute("petOne");
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
            %> (1,2,1)</li>
          <li><%
            Object petTwo = request.getAttribute("petTwo");
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
            %> (2,1,1)</li>
          <li>Carry</li>

          <p>You can use a level on pet here.</p>
        </ul>
        <h4 class="title">The Strat</h4>
        <br />
        <h6 class="title">Wolfus</h6>
        <p>
        <ul>
          <li>Minefield</li>
          <li>Extra Plating</li>
          <li>Missle to win</li>
        </ul>
        </p>
        <h6 class="title">Fangra</h6>
        <p>
        <ul>
          !!! Important note your first move against Fangra MUST be mine field. If it is
          still on CD pass this turn, then continue. !!!!!
          <li>Missle to death</li>
          <li>if Fangra beats Warbot swap in Cogblade Raptor, and use Overtune to win</li>
        </ul>
        </p>
        <h6 class="title">Wolfgar</h6>
        <p>
        <ul>
          <li>Swap in carry</li>
          <li>Swap back to Cogblade</li>
          <li>Overtune</li>
          <li>Batter to win</li>
        </ul>
        </p>
      </div>
    </div>
    <div class="post">
      <h2 class="title"><a target="_blank" href="http://www.wowhead.com/npc=87122/gargra#comments">
        Wowhead</a>
      </h2>
    </div>
  </div>
</div>

<!-- END CONTENT -->