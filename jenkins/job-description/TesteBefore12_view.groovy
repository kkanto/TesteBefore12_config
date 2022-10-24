 
listView('TesteBefore12 Jobs') {
    description('TesteBefore12 Jobs')
    jobs {
        regex('TesteBefore12_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
