// DLLNodes have a .next and .prev
class DLLNode {
    constructor(data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// DLLists have both a .head and .tail pointer
class DLList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // == Main Methods ==

    // push to head
    addHead(node) {
        node = this.head;
    }

    // pop from tail
    removeTail() {
        var top = this.head;
    }

    // return is empty
    isEmpty() {
        if (this.length = 0){
            return true;
        }
    }

    // return length
    size() {
        var x = this.length;
        return x;
    }

    // == Bonus Methods, just inverted versions of the first set ==

    // push to tail
    addTail(node) {}

    // pop from head
    removeHead() {}
}