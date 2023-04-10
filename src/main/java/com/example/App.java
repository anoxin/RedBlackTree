package com.example;

/**
 * Необходимо превратить собранное на семинаре дерево поиска в полноценное
 * левостороннее красно-черное дерево. И реализовать в нем метод добавления
 * новых элементов с балансировкой.
 * 
 * Красно-черное дерево имеет следующие критерии:
 * • Каждая нода имеет цвет (красный или черный)
 * • Корень дерева всегда черный
 * • Новая нода всегда красная
 * • Красные ноды могут быть только левым ребенком
 * • У краной ноды все дети черного цвета
 * 
 * Соответственно, чтобы данные условия выполнялись, после добавления элемента в
 * дерево необходимо произвести балансировку, благодаря которой все критерии
 * выше станут валидными. Для балансировки существует 3 операции – левый малый
 * поворот, правый малый поворот и смена цвета.
 *
 */
public class App {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(30);
        node.inorder();
        System.out.println("\n");
        node.insert(-23);
        node.inorder();
        System.out.println("\n");
        node.insert(-43);
        node.inorder();
        System.out.println("\n");
        node.insert(-443);
        node.inorder();
        System.out.println("\n");
        node.insert(-4434);
        node.inorder();
        System.out.println("\n");
        node.insert(-443434);
        node.inorder();
    }
}
