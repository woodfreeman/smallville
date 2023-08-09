const client = new smallville({
    host: "http://localhost:8080", // host of the server
    stateHandler: function(state) {
        //in here you would update the location of the agent using your own pathfinding algorithm
        const agents = state.agents
        const objects = state.locations
        const conversations = state.conversations
            
        console.log('[State Change]: The simulation has been updated')
},
});
client.createLocation({
    name: 'Red House: Bathroom: Stove',
    state: 'off'
});