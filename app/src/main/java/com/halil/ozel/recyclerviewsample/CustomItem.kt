package com.halil.ozel.recyclerviewsample

/**
 * Created by halilozel1903 on 11.05.2025.
 */

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import coil.compose.AsyncImage
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomItem(person: Person) {
    val columns = listOf(
        Triple(person.age.toString(), 1f, MaterialTheme.typography.bodyLarge),
        Triple("${person.firstName} ${person.lastName}", 3f, MaterialTheme.typography.bodyLarge),
        Triple(person.nation, 2f, MaterialTheme.typography.bodyMedium),
        Triple(person.musicType, 3f, MaterialTheme.typography.bodyMedium)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {
        AsyncImage(
            model = person.imageUrl,
            contentDescription = null,
            modifier = Modifier
                .width(64.dp)
                .padding(8.dp)
        )
        TableDivider()
        columns.forEachIndexed { index, (value, weight, style) ->
            if (index > 0) TableDivider()
            TableCell(text = value, weight = weight, style = style)
        }
    }
}

@Composable
private fun RowScope.TableCell(
    text: String,
    weight: Float,
    style: TextStyle,
    maxLines: Int = 2
) {
    Text(
        text = text,
        style = style,
        modifier = Modifier
            .weight(weight)
            .padding(8.dp),
        maxLines = maxLines
    )
}

@Composable
private fun TableDivider() {
    HorizontalDivider(
        modifier = Modifier
            .fillMaxHeight()
            .width(1.dp),
        color = Color.Gray
    )
}

@Composable
@Preview(showBackground = true)
fun CustomItemPreview() {
    CustomItem(
        person = Person(
            firstName = "Baby",
            lastName = "K",
            age = 42,
            nation = "Italy",
            musicType = "Pop / Rap",
            imageUrl = "https://picsum.photos/seed/baby/200"
        )
    )
}