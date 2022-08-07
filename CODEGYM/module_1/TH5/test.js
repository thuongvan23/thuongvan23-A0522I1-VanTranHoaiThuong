function Hero(image, top, left, size){
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function(){
        return '<img width="'+ this.size + '"' +
            ' height="'+ this.size + '"' +
            ' src="' + this.image +'"' +
            ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
    }

    this.moveRight = function(){
        this.left += 20;
        console.log('ok: ' + this.left);
    }
}
function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            moveLeft();
            break;
        case 39:
            moveRight();
            break;
        case 38:
            moveUp();
            break;
        case 40:
            moveDown();
            break;
    }
}
var hero = new Hero('pikachu.png', 20, 30, 200);
function moveRight(){
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 50)
}
